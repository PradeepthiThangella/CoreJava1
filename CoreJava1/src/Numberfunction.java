
public class Numberfunction {
public static int  getfactorial(int n)
{
	int f=1;
	while(n!=0) {
		f=f*n;
		if(n<0)
			n++;
		else n--;
	}
	return f;
}
}
