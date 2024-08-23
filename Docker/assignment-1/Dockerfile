# use this empty Dockerfile to build your assignment
FROM node:6-alpine

EXPOSE 3000

RUN apk add --no-cache tini 

WORKDIR /usr/src/app

COPY package.json package.json

RUN npm install && npm cache clean --force

COPY . .

# you use -- to separate tini from the command it should run.
# When you put those all together, the command that docker runs is /sbin/tini -- node ./bin/www

CMD ["/sbin/tini",  "--" ,"node" ,"./bin/www"]
