#include <iostream>

using namespace std;

int retornaPessoaMaisAlta(int meuarray[]){
    int s = meuarray[0];
    int l = sizeof(meuarray) / sizeof(meuarray[0]);
    for (int i = 1;i<=l;i++){
        if (s < meuarray[i] ){
            s = meuarray[i];
        }
    }
    return s;
}    

int main(){
    int meuarray[] = {1,10,3,6,8,20};
    return 0;
}
