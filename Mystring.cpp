#include <iostream>
#include "MyString.h"
using namespace std;

unsigned int strLen(const char* str)
{
    int count = 0;

	while (str[count]!='\0')
	{
		count++;
	}

	return count;
}

void strCpy(char* dest, const char* source)
{
	while (*source) 
	{
		*dest++ = *source++;
	}
	*dest = '\0';
}

char strCat(char* dest, const char* source)
{
	
	char* rdest = dest;

	while (*dest)
		dest++;
	while (*dest++ = *source++);
	return *rdest;
	
}

void strReverse(char *str)
{
	int i, len = 0, n;
	char temp;
	len = strlen(str);
	n = len - 1;
	for (i = 0; i <= (len / 2); i++)
	{
		temp = str[i];
		str[i] = str[n];
		str[n] = temp;
		n--;
	}
}

void strToUpper(char* str)
{
	while (*str != '\0')
	{
		if (*str >= 97 && *str <= 122)
		{
			*str = *str - 32;
		}
		str++;
	}
}

void strToLower(char* str)
{
	while (*str != '\0')
	{
		if (*str >= 65 && *str <= 90)
		{
			*str = *str + 32;
		}
		str++;
	}
}

int strStr(const char* str, const char* substr)
{
	int i = 0;
	while (str++)
	{
		i++;
		const char* s1 = str;
		const char* p1 = substr;
		while (*s1 == *p1)
		{
			s1++; p1++;
		}
		if (*p1 == '\0') return i;
		if (*s1 == '\0') return -1;
	}
	return -1;
}

int strCmp(const char* str1, const char* str2) 
{
	while (*str1 && *str2)
	{
		if (*str1 < *str2)
			return -1;
		else if (*str1 > *str2)
			return 1;
		str1++;
		str2++;
	}
	if (!*str1 && *str2)
		return -1;
	else if (*str1 && !*str2)
		return 1;
	else
		return 0;
}


