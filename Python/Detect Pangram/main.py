import string
def is_pangram(text):
    # Implementation
    alp = "abcdefghijklmnopqrstuvwxyz"
    for ch in alp:
        if ch not in text.lower(): #if text doesn't contain the whole alp
            return False
    return True
    
    #checking the length of the exclusive chars and reverse-booling :D
    
    #return not bool([char for char in string.ascii_lowercase if char not in s.lower()]) 
    