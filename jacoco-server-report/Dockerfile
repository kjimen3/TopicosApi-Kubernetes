# Usa la imagen de Nginx como base
FROM nginx:alpine

# Copia los reportes JaCoCo al directorio de Nginx
COPY jacocoHtml /usr/share/nginx/html/jacocoHtml

# Expon el puerto 80 para servir el contenido
EXPOSE 80

