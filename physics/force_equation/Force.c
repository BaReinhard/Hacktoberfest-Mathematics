#include <stdio.h>
//Force = Mass * Acceleration;

int main(){
int m,a;

printf("insert the mass in KG :");
scanf("%d",&m);

printf("\nInsert the acceleration (in m/s^2):");
scanf("%d",&a);

printf("Force: %d N",a*m); //Newton


return 0;

}
