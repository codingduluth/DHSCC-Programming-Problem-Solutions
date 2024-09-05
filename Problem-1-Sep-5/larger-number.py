# Python: Find the largest of two numbers
def find_largest(num1, num2):
    if num1 > num2:
        return num1
    else:
        return num2

# Test the function
num1 = 10
num2 = 20
print("The largest number is:", find_largest(num1, num2))