#include <bits/stdc++.h>
using namespace std;


int N = 6;


static char solve(string first, string second, string third) {
    // screw it lmao c++ should be fast enough
    int res = 0;
    char res_char;
    for (int i = 0; i < first.size(); ++i) {
        for (int j = 0; j < second.size(); ++j) {
            for (int k = 0; k < third.size(); ++k) {
                if (first[i] == second[j] && first[i] = third[k]) {
                    res_char = third[k];
                }
            }
        }
    }

    // res = (int) res_char;

    // if (res >= (int) 'a' && res <= (int) 'z') {
    //     return (int) res -96;
    // } else {
    //     return (int) res -38;
    // }
    // return -1;

    return first[1];
}

int main() {
    freopen("test.txt", "r", stdin);
    string lines[N];
    char res[N];
    
    for (int i = 0; i < N; ++i) {
        cin >> lines[i];
    }

    string first = "vJrwpWtwJgWrhcsFMMfFFhFp";
    string second = "jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL";
    string third = "PmmdzqPrVvPwwTWBwg";

 
 
    int result = 0;

    cout << solve(first, second, third);


    // cout << result << '\n';

    return 0;
}

