def capitalize(s):
    return ["".join([s[c].upper() if not c%2 else s[c] for c in range(len(s))]), "".join([s[c] if not c%2 else s[c].upper() for c in range(len(s))])] 
    #a mini locomotive :D