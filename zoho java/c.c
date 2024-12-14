
//28.

// #include<stdio.h>
// #include<string.h>
// int isPalindrome(char ch[])
// {
//     int i=0,j=strlen(ch)-1;
//     while(i<=j)
//     {
//         if(ch[i]!=ch[j])
//         {
//             return 0;
//         }
//         i++;
//         j--;
//     }
//     return 1;
// }
// int main()
// {
//     char ch[1000][1000];
//     char ch1[1000],c[1000];
//     int i=0;
//     while(scanf("%s",ch[i])==1)
//     {
//         if(isPalindrome(ch[i])==0)
//         {
//             printf("%s ",ch[i]);
//         }
//     }
// }

// #include<stdio.h>

// int main()
// {
//     int a=10;
//     static int b=1;
//     // a=b;----> 1 1
//     // b=a;----> 10 10
//     printf("%d %d\n",a,b);
//     int arr[5]={10};
//     for(int i=0;i<5;i++)
//     {
//         printf("%d ",arr[i]);//10 0 0 0 0
//     }
//     printf("\n");
//     int arr1[10];
//     int i=0;
//     arr1[i]=i++;
//     arr1[i]=++i;
//     arr1[i]=i+1;
//     printf("%d %d %d\n",arr1[0],arr1[1],arr1[2]);

//     int arr2[2][3][2]={1,2,3,4,5,6,7,8,9,20,21};
//     printf("%d",arr2[1][1][1]);

//     // char ch[]="122";
//     // ch=ch+1;
//     // printf("%s ",ch);//error
// }
//---------------
//6.
/*
#include<stdio.h>
int isPalindrome(char ch[])
{
    int len=0;
    for(int i=0;ch[i];i++)
    {
        len++;
    }
    int i=0;
    len=len-1;
    while(i<=len)
    {
        if(ch[i++]!=ch[len--])
        {
            return 0;
        }
    }
    return 1;
}
int main()
{
    char ch[100][100];
    int i=0;
    while (scanf("%s",ch[i])==1)
    {
        if(isPalindrome(ch[i])==0)
        {
            printf("%s ",ch[i]);
        }
    }
}
*/
//7.