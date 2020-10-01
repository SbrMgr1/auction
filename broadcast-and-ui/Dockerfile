FROM node:alpine
WORKDIR '/app'
COPY package.json .
RUN npm install
COPY ./build ./build

RUN npm install -g serve

CMD ["serve","-s","build"]

# docker build -t reactapp .
# docker run -it -v /app -v /app -p 8000:5000 reactapp