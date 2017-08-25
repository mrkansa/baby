# baby
Pillar babysitter Kata

2 main variables for simulation:

baby bed time
parents home time, implementation in baby2.0

assume start time of shift will be more consistant than end time of shift, showing up at
5:00 gets the babysitter paid $12 minimum.
assume baby will generally go to bed around 9:00
assume when baby is up until midnight, assume 3rd shift might generally end early

1st shift $12/hr:
1st hour 5:00 pm -> 6:00 pm  == (12 * 1) $12
2nd hour 6:00 pm -> 7:00 pm  == (12 * 2) $24
3rd hour 7:00 pm -> 8:00 pm  == (12 * 3) $36
4th hour 8:00 pm -> 9:00 pm  == (12 * 4) $48
2nd shift $8/hr:
5th hour 9:00 pm -> 10:00 pm == (48 + 8) $56
6th hour 10:00 pm -> 11:00 pm == (56 + 8) $64
7th hour 11:00 pm -> 12:00 pm == (64 + 8) $72
3rd shift $16/hr:
8th hour: 12:00 am -> 1:00 am == (72 + 16) $88
9th hour: 1:00 am -> 2:00 am == (88 + 16 $104
10th hour: 2:00 am -> 3:00 am == (104 + 16) $120
11th hour: 3:00 am -> 4:00 am == (120 + 16) $136

To run:

install manven (Maven 3.3+ require JDK 1.7 or above to execute):
https://maven.apache.org/download.cgi

$ git clone https://github.com/mrkansa/baby.git

$ cd baby

$mvn -version

$mvn package -q (may need to run this command more than once due to package downloads in background)
