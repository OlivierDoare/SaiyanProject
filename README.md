Description of all variables and classes needed
Creation of the profile
Add session : counting points and repetitions

The Body is an object that can be modified after logging a session. 
Size and Level are also objects that defines the Body.
Body is serealizable
Session also
A Session count the number of repetition per machine

When you log a session, you can enter the numer of repetition on a machine with the weight lifted.
Machines have to be described (interface ? class ?  just attribute of the upLevel or downLevel ?)
Example : push-ups is for upLevel so in the upLevel object, there will have to be a push-up

Logging a Session :
1 - set date
2 - ask for up or down
3 - ask for machine
4 - ask for nbSerie and nbRepetition
5 - ask if more 
6 - go back to 3 if yes, else add the session to the serealizable file
7 - print the score for the session
8 - print the global score
