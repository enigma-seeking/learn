安装好git后，首先要确认身份

```
$ git config --global user.name "Your Name"
$ git config --global user.email "email@example.com"
```



之后在git上创建新仓库，在本地创建同名仓库。

建立ssh连接

第1步：创建SSH Key。在用户主目录下，看看有没有.ssh目录，命令是cd ~/.ssh 如果有，再看看这个目录下有没有`id_rsa`和`id_rsa.pub`这两个文件，如果已经有了，可直接跳到下一步。如果没有，打开Shell（Windows下打开Git Bash），创建SSH Key：

```
$ ssh-keygen -t rsa -C "youremail@example.com"
```

你需要把邮件地址换成你自己的邮件地址，然后一路回车，使用默认值即可，由于这个Key也不是用于军事目的，所以也无需设置密码。

如果一切顺利的话，可以在用户主目录里找到`.ssh`目录，里面有`id_rsa`和`id_rsa.pub`两个文件，这两个就是SSH Key的秘钥对，`id_rsa`是私钥，不能泄露出去，`id_rsa.pub`是公钥，可以放心地告诉任何人。

第2步：登陆GitHub，打开“Account settings”，“SSH Keys”页面：

然后，点“Add SSH Key”，填上任意Title，在Key文本框里粘贴`id_rsa.pub`文件的内容。



这样ssh的连接就有了

之后再本地仓库中输入命令

git init

使得git可以管理这个文件夹

之后输入

```
$ git remote add origin git@github.com:enigma-seeking/learn.git
```

将本地仓库和git仓库连接上

git branch -M main 

创建新batch main作为默认batch

想要将本地文件上传git仓库。

可以

```
git add '文件名'
git commit -m '注释'
git push origin main
```

想上传文件，应该是必须有注释。上面这三句话就是标准流程



