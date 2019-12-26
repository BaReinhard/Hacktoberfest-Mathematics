
class GP():
    def __init__(self, first_term, common_ratio, number_of_terms):
        self.a = first_term
        self.r = common_ratio
        self.n = number_of_terms
        pass

    def Print(self):
        for x in range(self.n):
            print(self.a * (self.r**x), end=" ")
            pass
        print()
        pass

    def Get_Sum(self):
        return (self.a * ((1 - (self.r ** self.n)) / (1 - self.r)))
    pass

gp = GP(1,2,2)
print("---- GP is ----")
gp.Print()
print("---- Sum of gp is ----")
print(gp.Get_Sum())
