#include <stdio.h>
#include <math.h>
int main(){
	double t1, g1, t2, g2;
	printf("Enter t1, g1, t2, g2: ");
	scanf("%lf", &t1);
	scanf("%lf", &g1);
	scanf("%lf", &t2);
	scanf("%lf", &g2);
	t1 = t1* 0.0349;
	g1 = g1* 0.0349;
	t2 = t2* 0.0349;
	g2 = g2* 0.0349;
	
	double distance = 6371.01 * acos(sin(t1)* sin(t2) + cos(t1) * cos(t2) * cos(g1-g2));
	printf("The distance is %lf",distance);
}
