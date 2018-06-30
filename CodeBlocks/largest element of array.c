#include <stdio.h>

int main(void)

{
    int data[100];

    int loc = 0;

    int count = 0;

    int max = data[0];

    ++count;

    if (count > strlen(data) )
    printf("LOC%d IS MAX\n",data[count]);

    else
       {
         count = loc;
         max = data[count];
         printf("LOC%d IS %d MAX\n", data[count], count);
       }

       int t, i, num[3][4];
    for(t=0; t<3; ++t)
    for(i=0; i<4; ++i)
    num[t][i] = (t*4)+i+1;
/* now print them out */
    for(t=0; t<3; ++t) {
    for(i=0; i<4; ++i)
    printf("%3d ", num[t][i]);
    printf("\n");

/*for(count=0; count<100; ++count)
    data[count] = count;

for(count=0; count<100; ++count)
    printf("%d \n", data[count]);*/
}
return 0;
}

