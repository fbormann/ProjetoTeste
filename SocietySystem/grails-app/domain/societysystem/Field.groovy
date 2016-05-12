package societysystem

class Field {
    String name
    int value

    static constraints = {
        name unique: true
    }
}
