n = int( input() )
l = map( int, raw_input().split() )
if len(l) - len( set(l) ) < 2:
    print 'NO'
else:
    print 'YES'
    def f( v ):
        for i in range( len(v) ):
            if v[i][0] == v[i+1][0] and v[i][1] < v[i+1][1]: 
                v[i],v[i+1] = v[i+1],v[i]
                break
        print " ".join( [ str(y) for x,y in v ] )

    v = sorted( zip( l, range( 1, n+1 ) ) )
    
    print " ".join( [ str(y) for x,y in v ] )
    f( v )
    f( v ) 