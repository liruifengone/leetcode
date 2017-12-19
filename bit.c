#include<stdio.h>


int isOneBitCharacter(int* bits, int bitsSize) {
    
    int i = 0;
    
    for(i=0;i<bitsSize;)
    {
         if(i==bitsSize-1)
            return 0;
        if(i==bitsSize-2)
        {
            if(bits[i]==1)
                return 0;
            if(bits[i]==0)
                return 1;
        }
        if(bits[i]==0)
            i++;
        if(bits[i]==1)
            i+=2;
       
    }
    return 1;
    
}
int main()
{
	int t[] ={0,1,0};
int length = 3;
printf("%d",isOneBitCharacter(t,length));
return 0;	
}