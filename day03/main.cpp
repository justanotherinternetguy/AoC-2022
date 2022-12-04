#include <bits/stdc++.h>
using namespace std;

/*
- two large compartments
- supposed to sort by type, elf that followed this rule forgot to sort by type

- INPUT: list of all item currently in backpack (line by line)
- types determined by letter case
- first half of string = first compartment, etc

- (a-z) = 1-26
- (A-Z) = 27-52
- SUM
*/

int N = 6;

// static std::vector<char> sortPriority(std::vector<char> vc) {

// }

static char findDuplicate(string first_half, string second_half) {
    // screw it lmao c++ should be fast enough
    return 'A';
}

int main() {
    freopen("test.in", "r", stdin);
    string lines[N];
    char res[N];
    
    for (int i = 0; i < N; ++i) {
        cin >> lines[i];
    }

    int half_len = lines[1].size() / 2;
    cout << lines[1].substr(0, half_len);

    return 0;
}