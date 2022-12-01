lines = []
with open("main.txt") as file:
    for line in file:
        lines.append(line.rstrip())
most = 0
curr = 0
out = []
for l in lines:
    if l == "":
        out.append(most)
        curr = 0
    else:
        curr += int(l)
        most = max(most, curr)

print(max(out))

# 67450
