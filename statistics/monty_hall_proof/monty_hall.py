import sys
import random


def play(swap):

    # Generate random door contents
    doors = ['goat', 'goat', 'car']
    random.shuffle(doors)

    # Pick a door
    door_choice = random.randrange(3)
    # Selecting door ; door_choice

    # Show a door with a goat
    for (door_idx, contents) in enumerate(doors):
        if door_idx != door_choice and contents == 'goat':
            # The host reveals a goat behind door ; goat_door
            goat_door = door_idx
            break

    if swap:
        # Swap to the other door
        for (door_idx, contents) in enumerate(doors):
            if door_idx != door_choice and door_idx != goat_door:
                swap_to = door_idx
    else:
                # "Swapping to door" ; swap_to
        swap_to = door_choice

    if doors[swap_to] == 'car':
        # "You won"
        return 1
    else:
        # "You lost"
        return 0


random.seed()

rounds = 1000
swap = False
wins = sum(play(swap) for i in xrange(rounds))
print 'Winning probability without swap is ', wins / (rounds * 1.0)

swap = True
wins = sum(play(swap) for i in xrange(rounds))
print 'Winning probability with swap is ', wins / (rounds * 1.0)