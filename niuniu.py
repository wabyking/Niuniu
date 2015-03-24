def getNiu(card):    
    sum=0
    for x in range(5):
        sum+=card[x]
    for i in range(5):
        for j in range(i+1, 5):
            for k in range(j+1, 5):
                if (card[i] + card[j] + card[k]) % 10 == 0:
                    return sum%10;
    print "no Niu"
    return -1;
if __name__ == "__main__":
    card = [10,1,2,3,7]
    for i in range(5):
        if card[i]>=10:
            card[i]=0;
    print getNiu(card)
                    
        
