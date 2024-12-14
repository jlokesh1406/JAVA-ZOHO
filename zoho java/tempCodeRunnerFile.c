
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
        if(isPalindrome(ch[i])==1)
        {
            printf("%s ",ch[i]);
        }
    }
}

