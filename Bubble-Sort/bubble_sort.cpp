#include <iostream>
#include <vector>

using namespace std;


void swap(int* a, int* b) {
    int temp = *b;
    *b = *a;
    *a = temp;
}

/*  Sample Input
      3
      3 2 1
 */

int main(){
    int n; // 3
    cin >> n;
    vector<int> a(n); // 3 2 1

    for(int a_i = 0;a_i < n;a_i++){
        cin >> a[a_i];
    }

    int totalSwaps = 0;

    for (int i=0; i<n; i++) {

        int numOfSwaps = 0;

        for (int j=0; j<n-1; j++) {
            if (a[j] > a[j+1]) {
                swap(a[j], a[j+1]);
                numOfSwaps++;
            }
        }

        totalSwaps += numOfSwaps;

        if (numOfSwaps == 0) {
            break;
        }
    }


    cout << "Array is sorted in " << totalSwaps << " swaps."<< endl;
    cout << "First Element: " << a[0] << endl;
    cout << "Last Element: " << a[n-1] << endl;

    return 0;

}