# wxorder
微信扫码支付

# 订单相关
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
