# API-Dokumentation

### Get the last Verse:
<code>GET</code> <code>http://localhost:8080/api/verse </code>

**Beschreibung:** 
Diese GET-Anfrage gibt den letzten Vers zurück, der in der Datenbank gespeichert ist. Der Antwort-Body enthält die ID des Verses, den Text des Verses sowie die Bibelstelle, auf die sich der Vers bezieht.

Antwort-Beispiel:
```
{
"id": 4,
"verse": "Alles nun, was ihr wollt, dass euch die Leute tun sollen, das tut ihr ihnen auch! Das ist das Gesetz und die Propheten.",
"passage": "Matthäus 7,12"
}
```

### Override the old Verse:
<code>PUT</code> <code>http://localhost:8080/api/verse </code>

**Beschreibung:**
Mit dieser PUT-Anfrage können Sie einen vorhandenen Vers in der Datenbank überschreiben. Der Body der Anfrage muss den Text des neuen Verses und die entsprechende Bibelstelle enthalten.

Body-Beispiel:
```
{
"verse": "Alles nun, was ihr wollt, dass euch die Leute tun sollen, das tut ihr ihnen auch! Das ist das Gesetz und die Propheten.",
"passage": "Matthäus 7,12"
}
```