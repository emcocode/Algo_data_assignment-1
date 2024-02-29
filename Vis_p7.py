import matplotlib.pyplot as plt
import math

size = [200, 400, 800, 1600, 3200, 6400]

# P5
time_p5 = [0.007, 0.053, 0.423, 3.192, 27.167, 223.612]

print("P5 log2 ratio:")
for i in range(len(time_p5)):
    if i != len(time_p5) - 1:
        print((math.log2(time_p5[i+1]) - math.log2(time_p5[i]))/(math.log2(size[i+1]) - math.log2(size[i])))


# P6
time_p6 = [0.0017, 0.007, 0.029, 0.123, 0.520, 2.212]

print("P6 log2 ratio:")
for i in range(len(time_p6)):
    if i != len(time_p6) - 1:
        print((math.log2(time_p6[i+1]) - math.log2(time_p6[i]))/(math.log2(size[i+1]) - math.log2(size[i])))


plt.scatter(size, time_p5, c='r', label='Brute force')
plt.scatter(size, time_p6, c='b', label='Caching')
plt.xlabel('Array size')
plt.ylabel('Time (s)')
plt.legend()
plt.show()