# wxorder 接口文档


# 订单相关

#### 3、查询详情
- ##### 请求地址 get：http://localhost:8080/htuut/buyer/order/detail
- ##### 请求参数

```
openid：fuiosdhfahkshfka
orderId：1554631489955158995
```
- ##### 返回结果
```
{
    "code": "1",
    "msg": "成功",
    "data": {
        "orderId": "1554631489955158995",
        "buyerName": "jack",
        "buyerPhone": "17688888888",
        "buyerAddress": "shenzhen",
        "buyerOpenid": "fuiosdhfahkshfka",
        "orderAmount": 20,
        "orderStatus": 0,
        "payStatus": 0,
        "createTime": 1554602531,
        "updateTime": 1554602531,
        "detailList": [
            {
                "detailId": "1554631490026627116",
                "orderId": "1554631489955158995",
                "productId": "1234561",
                "productName": "?????2",
                "productPrice": 10,
                "productQuantity": 2,
                "productIcon": "https://xxxxx.png"
            }
        ]
    }
}
```

#### 2、查询列表
- ##### 请求地址 get：http://localhost:8080/htuut/buyer/order/list
- ##### 请求参数

```
openid：fuiosdhfahkshfka
page：0
size：1
```
- ##### 返回结果
```
{
    "code": "1",
    "msg": "成功",
    "data": [
        {
            "orderId": "1554631480163872881",
            "buyerName": "jack",
            "buyerPhone": "17688888888",
            "buyerAddress": "shenzhen",
            "buyerOpenid": "fuiosdhfahkshfka",
            "orderAmount": 20,
            "orderStatus": 0,
            "payStatus": 0,
            "createTime": 1554602522,
            "updateTime": 1554602522,
            "detailList": null
        },
        {
            "orderId": "1554631489955158995",
            "buyerName": "jack",
            "buyerPhone": "17688888888",
            "buyerAddress": "shenzhen",
            "buyerOpenid": "fuiosdhfahkshfka",
            "orderAmount": 20,
            "orderStatus": 0,
            "payStatus": 0,
            "createTime": 1554602531,
            "updateTime": 1554602531,
            "detailList": null
        }
    ]
}
```

#### 1、创建订单
- ##### 请求地址 post：http://localhost:8080/htuut/buyer/order/create
- ##### 请求示例

```
{
	"name": "jack",
	"phone": "17688888888",
	"address": "shenzhen",
	"openid": "fuiosdhfahkshfka",
	"items": [{
	    "productId": "1234561",
	    "productQuantity": 2
	}]
}
```
- ##### 返回结果
```
{
    "code": "1",
    "msg": "成功",
    "data": {
        "orderId": "1554631489955158995"
    }
}
```

