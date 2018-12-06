trait RedisRepoImpl extends Repo {

    // The redis client
    def db: RedisClient

    def del(key: String): Future[Long] = db.del(key)

    def upsert[V: ByteStringSerializer](key: String, value: V, expire: Option[Duration] = None): Future[Boolean] = db.set(key, value)

    def get(key: String): Future[Option[String]] = db.get[String](key)

}