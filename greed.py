states_needed = set(["mt","wa","or","id","nv","ut","ca","az"])
stations = {}
stations["kone"] = set(["id","nv","ut"])
stations["ktwo"] = set(["wa","id","mt"])
stations["kthree"] = set(["or","nv","ca"])
stations["kfour"] = set(["nv","ut"])
stations["kfive"] = set(["ca","az"])
i = 0
print(len(states_needed))
final_station = set()
while states_needed:   #这种就可以直接表示集合为空则停止循环
    best_station = None
    states_covered = set()  #包含该广播台覆盖的所有未覆盖的洲
    for station, states_for_station in stations.items():
        covered = states_needed & states_for_station
        ##计算交集
        if len(covered) > len(states_covered):
            best_station = station
            states_covered = covered
   ##这个没法停下来
    states_needed -= states_covered
    final_station.add(best_station)

print(final_station)