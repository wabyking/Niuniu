def getNiu(card):    
    sum=0
    for x in range(5):
        sum+=card[x]
    for i in range(5):
        for j in range(i+1, 5):
            if (sum - card[i] - card[j]) % 10 == 0:
                print "youniu"
                return sum % 10
            else:
                pass 
    print "no Niu"
    return -1;
if __name__ == "__main__":
    card = [10,1,2,3,7]
    for i in range(5):
        if card[i]>=10:
            card[i]=0;
    print getNiu(card)
                    
        
