def divisor(n):
    for a in range(1,n+1):
        if(n%a==0):
            print(str(a),end=' ')

divisor(80000000)
