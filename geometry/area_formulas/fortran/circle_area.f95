! Calculate the area of a circle

PROGRAM Circle
IMPLICIT NONE

REAL, PARAMETER :: PI = 3.141593
REAL :: radius
REAL :: area

    WRITE (*,*) "Enter the radius"
    READ (*,*) radius
    
    area = PI * (radius ** 2)

    WRITE (*,*) "Area is", area

END PROGRAM Circle
