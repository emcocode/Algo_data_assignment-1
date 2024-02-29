import matplotlib.pyplot as plt

# 100k
# obj = "100k objects"
# uf = [0.323, 0.681, 0.971, 1.283, 1.555, 1.883, 2.203, 2.494, 2.899]
# quf = [0, 0, 0.001, 0.001, 0.002, 0.011, 0.102, 0.373, 0.861]
# unions = [10000, 20000, 30000, 40000, 50000, 60000, 70000, 80000, 90000]

# 250k
# obj = "250k objects"
# uf = [1.905, 3.745, 5.573, 7.385, 9.132, 11.21, 13.117, 15.249, 16.784]
# quf = [0.001, 0.001, 0.003, 0.004, 0.005, 0.08, 0.951, 3.503, 8.071]
# unions = [25000, 50000, 75000, 100000, 125000, 150000, 175000, 200000, 225000]


# 500k
obj = "500k objects"
uf = [7.35, 14.591, 22.029, 29.467, 36.818, 44.617, 51.470, 59.035, 65.739]
quf = [0.002, 0.003, 0.005, 0.007, 0.011, 0.373, 4.52, 16.027, 35.766]
unions = [50000, 100000, 150000, 200000, 250000, 300000, 350000, 400000, 450000]

plt.title(obj)
plt.scatter(unions, uf, c='r', label='UF')
plt.scatter(unions, quf, c='b', label='QUF')
plt.xlabel('Unions')
plt.ylabel('Time (s)')
plt.legend()
plt.show()