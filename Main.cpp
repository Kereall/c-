#include <iostream>
#include "MyString.h"
using namespace std;
int main()
{
	char str1[255] = "Hello world!";
	char str2[255] = "world";
	char str3[255] = "";
	char str4[255] = "!!";
	char str5[255] = "world";

	cout <<"Lenght str1: "<< strLen(str1)<< endl;
	strCpy(str3, str1);
	cout << "Result strCpy(str1 and str3): " << str3 << endl;
	strCat(str1, str4);
	cout << "Result strCat(str1 and str4): " << str1 << endl;
	strReverse(str2);
	cout << "Result strReverse(str2): " << str2 << endl;
	strToUpper(str1);
	cout << "Result strToUpper: " << str1 << endl;
	strToLower(str1);
	cout << "Result strToLower: " << str1 << endl;
	cout << "Result strCmp(str1 and str2): " << strCmp(str1, str2)<< endl;
	cout << "Result strCmp(str2 and str5): " << strCmp(str2, str5) << endl;
	int n = strStr(str1, str2);
	cout << "Result strCmp(str1 and str2): " << n;
	return 0;
}