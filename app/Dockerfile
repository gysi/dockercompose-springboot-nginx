FROM maven:3.5

RUN apt install unzip && \
    wget -q -O jrebel.zip https://$( wget -q -O- https://zeroturnaround.com/software/jrebel/download/thank-you/?file=jrebel/releases/jrebel-2018.1.5-nosetup.zip | grep -m 1 -o dl.*token=[0-9a-z]*) && \
    unzip jrebel.zip
