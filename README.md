# uPortal Waffle Menu Service

A RESTful service to provide each user appropriate menu items.

Users are identified by JWT and the roles embedded in the JWT serves as a filter against the 'master' list of items.

The master list of items are configured via a json file on the server of the form:

```json
{
	"menu-items": [
		{
			"title":"Example menu item",
			"iconUrl":"https://my.example.com/icon",
			"groups": ["SYSTEM_ADMINISTRATOR", "STUDENT"]
		},
		...
	]
}
```

The service is a singular GET endpoint with no parameters.
