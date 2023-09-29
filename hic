#include <stdio.h>
int main()
{
	unsigned int n,t,y;
	printf("Nhap dd//mm/yyyy");
	printf("\nNhap nam: ");
	scanf("%u",&y);
	if(y>0)
		{
			printf("%u la nam hop le",y);
		}
	else
		printf("%u la nam khong hop le",y);
//xet nam nhuan hay khong nhuan	
	if ((y%4==0&&y%100!=0)||(y%400==0))
		printf("\n%u la nam nhuan",y);
	else 
		printf("\n%u khong phai la nam nhuan",y);
		printf("\nNhap thang: ");
		scanf("%u",&t);
	if(t>0&&t<=12)
		{
			printf("\nThang %u la thang hop le",t);
		}
	else 
			printf("\nThang %u la thang hop le",t);
//xet thang co 31 ngay	
	if(t==1||t==3||t==5||t==7||t==8||t==10||t==12)
			{
				printf("\nNhap so ngay hop le: ",n);
				scanf("%u",&n);
				if(n>0&&n<=31)
				printf("%u la so ngay hop le",n);
				else
				printf("%u la so ngay khong hop le",n);
			}
//xet thang co 30 ngay			
	else if(t==4||t==6||t==9||t==11)
				{
					printf("\nNhap so ngay hop le: ",n);
					scanf("%u",&n);
					if(n>0&&n<=30)
					printf("%u la so ngay hop le",n);
					else
					printf("%u la so ngay khong hop le",n);
				}
//xet thang 2
	else if(t==2)
	{	
		
		if ((y%4==0&&y%100!=0)||(y%400==0))//xet nam nhuan
				{
					printf("\nNhap so ngay hop le",n);
					printf("\nNgay: ");
					scanf("%u",&n);
				}
			if(n>0&&n<=29)
					printf("%u la so ngay hop le",n);
			else if(n<0&&n>29)
					printf("%u la so ngay khong hop le",n);
		if((y%4!=0&&y%100==0)||(y%400!=0))//xet nam ko nhuan
					{
						printf("\nNhap so ngay hop le",n);
						printf("\nNgay: ");
						scanf("%u",&n);
					}
			if(n>0&&n<=28)
					printf("\n%u la so ngay hop le",n);
			else 
					printf("\n%u la so ngay khong hop le",n);		
	
	}
	
			
	return 1;
}
