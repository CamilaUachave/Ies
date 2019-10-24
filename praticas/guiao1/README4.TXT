CMD	postgres
ENTRYPOINT	docker-entrypoint.sh
EXPOSE	5432/tcp
VOLUME	/var/lib/postgresql/data
ENV	
PATH	/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin:/usr/lib/postgresql/11/bin
GOSU_VERSION	1.11
LANG	en_US.utf8
PG_MAJOR	11
PG_VERSION	11.5-1.pgdg90+1
PGDATA	/var/lib/postgresql/data
