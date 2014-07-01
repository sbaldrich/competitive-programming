def is_tandem( substr ):
    n = len( substr ) / 2
    for i in range( n ):
        if substr[i] != substr[i+n] and substr[i+n] != '*':
            return False
    return True

s = raw_input()
k = int( raw_input() )
s = s + '*'*k
ans = 0
for ( l, r ) in [ ( l,r ) for l in range( len(s) ) for r in range( l+2, len(s) + 1 , 2 ) ]:
    if is_tandem( s[l:r] ):
        ans = max(ans, len(s[l:r]) )
print ans

