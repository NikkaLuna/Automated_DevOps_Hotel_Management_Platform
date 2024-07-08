
ARG CACHEBUST=$(DATE +%s)
FROM node:18-alpine AS build 
WORKDIR /app
COPY package*.json ./
COPY package-lock.json* ./  

RUN rm -rf node_modules 
RUN npm ci --omit=dev  
RUN npm install -g @angular/cli

ENV PATH=$PATH:/usr/local/lib/node_modules/.bin

COPY . .

ENV NODE_PATH=/usr/local/lib/node_modules
ENV NODE_OPTIONS="--max_old_space_size=4096"

RUN sed -i '1s;^.*$;#!/usr/bin/env node;' node_modules/.bin/*
RUN ng build --configuration production --optimization

# Production stage
FROM nginx:alpine
COPY --from=build /app/../resources/static /usr/share/nginx/html
COPY nginx.conf /etc/nginx/nginx.conf
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]