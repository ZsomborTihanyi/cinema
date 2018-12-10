export class Movie {
    id = null
    name = ''
    genre = ''
    runtime = ''
    description = ''

    public ToString() {
        return this.name + ' ' + this.genre + ' ' + this.runtime;
    }
}
