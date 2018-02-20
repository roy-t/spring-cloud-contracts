org.springframework.cloud.contract.spec.Contract.make {
    request {
        method 'GET'
        urlPath('/v2/cases'){
            queryParameters {
                parameter 'responsible_org_type' : 'SELLER'
                parameter 'responsible_org_id' : '123123'
            }
        }
        headers {
            header('Accept', 'application/json')
        }
    }
    response {
        status 200
        body("""
      {
      "Cases": {
        "count": 5,
        "total": 100
      }
    }
  """)
        headers {
            header('Content-Type': 'application/json')
        }
    }
}