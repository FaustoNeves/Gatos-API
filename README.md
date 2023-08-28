# Desafio para consumir e exibir a [Imgur API](https://api.imgur.com/)

Endpoint do desafio: https://api.imgur.com/3/gallery/search/?q=cats
-
![Cat API](https://github.com/FaustoNeves/Gatos-API/assets/66192808/7134985b-9403-4214-b9ff-79253c84307b)

Para a exibição de imagens e do mp4, foram mapeados os campos: type (podendo ser video/mp4 e image/jpeg) e o campo link (URI do arquivo) do objeto images:
-
![Cat API 2](https://github.com/FaustoNeves/Gatos-API/assets/66192808/2c85ee5b-e729-425f-9fde-5e8d822f8fce)

Payload exemplo da lista data:
-
```json
{
    "data": [
        {
            "id": "Vk3PKQc",
            "title": "He makes the best sounds",
            "description": null,
            "datetime": 1693191961,
            "cover": "y1iVjEx",
            "cover_width": 720,
            "cover_height": 1280,
            "account_url": "liketorun42",
            "account_id": 142865067,
            "privacy": "hidden",
            "layout": "blog",
            "views": 40,
            "link": "https://imgur.com/a/Vk3PKQc",
            "ups": 5,
            "downs": 0,
            "points": 5,
            "score": 5,
            "is_album": true,
            "vote": null,
            "favorite": false,
            "nsfw": false,
            "section": "",
            "comment_count": 1,
            "favorite_count": 0,
            "topic": null,
            "topic_id": null,
            "images_count": 1,
            "in_gallery": true,
            "is_ad": false,
            "tags": [
                {
                    "name": "cats",
                    "display_name": "Cats",
                    "followers": 213485,
                    "total_items": 134583,
                    "following": false,
                    "is_whitelisted": false,
                    "background_hash": "xeEIpAn",
                    "thumbnail_hash": null,
                    "accent": "BF63A7",
                    "background_is_animated": false,
                    "thumbnail_is_animated": false,
                    "is_promoted": false,
                    "description": "Our feline friends",
                    "logo_hash": null,
                    "logo_destination_url": null,
                    "description_annotations": {}
                },
                {
                    "name": "cute",
                    "display_name": "Cute",
                    "followers": 169961,
                    "total_items": 277185,
                    "following": false,
                    "is_whitelisted": false,
                    "background_hash": "MifWJps",
                    "thumbnail_hash": null,
                    "accent": "3BA3B1",
                    "background_is_animated": false,
                    "thumbnail_is_animated": false,
                    "is_promoted": false,
                    "description": "",
                    "logo_hash": null,
                    "logo_destination_url": null,
                    "description_annotations": {}
                },
                {
                    "name": "cat",
                    "display_name": "cat",
                    "followers": 2212036,
                    "total_items": 287241,
                    "following": false,
                    "is_whitelisted": false,
                    "background_hash": "xeEIpAn",
                    "thumbnail_hash": null,
                    "accent": "159559",
                    "background_is_animated": false,
                    "thumbnail_is_animated": false,
                    "is_promoted": false,
                    "description": "feline friends",
                    "logo_hash": null,
                    "logo_destination_url": null,
                    "description_annotations": {}
                }
            ],
            "ad_type": 0,
            "ad_url": "",
            "in_most_viral": false,
            "include_album_ads": false,
            "images": [
                {
                    "id": "y1iVjEx",
                    "title": null,
                    "description": null,
                    "datetime": 1693191959,
                    "type": "video/mp4",
                    "animated": true,
                    "width": 720,
                    "height": 1280,
                    "size": 1161512,
                    "views": 134,
                    "bandwidth": 155642608,
                    "vote": null,
                    "favorite": false,
                    "nsfw": null,
                    "section": null,
                    "account_url": null,
                    "account_id": null,
                    "is_ad": false,
                    "in_most_viral": false,
                    "has_sound": true,
                    "tags": [],
                    "ad_type": 0,
                    "ad_url": "",
                    "edited": "0",
                    "in_gallery": false,
                    "link": "https://i.imgur.com/y1iVjEx.mp4",
                    "mp4_size": 1161512,
                    "mp4": "https://i.imgur.com/y1iVjEx.mp4",
                    "gifv": "https://i.imgur.com/y1iVjEx.gifv",
                    "hls": "https://i.imgur.com/y1iVjEx.m3u8",
                    "processing": {
                        "status": "completed"
                    },
                    "comment_count": null,
                    "favorite_count": null,
                    "ups": null,
                    "downs": null,
                    "points": null,
                    "score": null
                }
            ],
            "ad_config": {
                "safeFlags": [
                    "album",
                    "in_gallery",
                    "gallery"
                ],
                "highRiskFlags": [],
                "unsafeFlags": [
                    "sixth_mod_unsafe",
                    "under_10",
                    "updated_date"
                ],
                "wallUnsafeFlags": [],
                "showsAds": false,
                "showAdLevel": 1,
                "safe_flags": [
                    "album",
                    "in_gallery",
                    "gallery"
                ],
                "high_risk_flags": [],
                "unsafe_flags": [
                    "sixth_mod_unsafe",
                    "under_10",
                    "updated_date"
                ],
                "wall_unsafe_flags": [],
                "show_ads": false,
                "show_ad_level": 1,
                "nsfw_score": 0
            }
        },
```
