#!/bin/env python

print("")
print("----Fire Load Calculator----")
print("")

#### STEP 1: Enter data ######################################

paper = raw_input("Enter the mass(kg) of paper: ")
wood = raw_input("Enter the mass(kg) of wood: ")
plastic = raw_input("Enter the mass(kg) of plastic: ")
textile = raw_input("Enter the mass(kg) of textiles: ")
area = raw_input("Enter the area(m^2): ")

## Make sure they are numbers ##
paper = int(paper)
wood = int(wood)
plastic = int(plastic)
textile = int(textile)
area = int(area)

#### STEP 2: Perform maths ###################################

## K Values ##
mass = paper + wood + plastic + textile
kPape = float(paper) / mass
kWood = float(wood) / mass
kPlas = float(plastic) / mass
kText = float(textile) / mass

## Average Heat Release Values ##
hrPape = 16.3
hrWood = 18.5
hrPlas = 43.5
hrText = 19.0

## Calculate Fire Load ##
flPape = paper * kPape * hrPape
flWood = wood * kWood * hrWood
flPlas = plastic * kPlas * hrPlas
flText = textile * kText * hrText
flTotal = flPape + flWood + flPlas + flText

## Calculate Fire Load Density ##
density = flTotal/area

print("")
print("Here are the fire load values in MJ:")
print "Paper:   ", flPape
print "Wood:    ", flWood
print "Plastic: ", flPlas
print "Textile: ", flText
print "TOTAL:   ", flTotal

print("")
print "Fire Load Density (MJ/m^2): ", density
print("")
