<template>
<div>
  <Nav></Nav>
  <form>
    <div class="form-group">
      <label for="ID">ID:</label>
      <input type="text" class="form-control" id="loginId" placeholder="Enter id" v-model="loginId">
    </div>
    <div class="form-group">
      <label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pwd" placeholder="Enter password" v-model="pwd">
    </div>
    <div class="checkbox">
      <label><input type="checkbox"> Remember me</label>
    </div>
    <button @click="count" class="btn btn-default">count</button>
    <button @click="deleteById" class="btn btn-default">deleteById</button>
    <button @click="existsById" class="btn btn-default">existsById</button>
    <button @click="findAll" class="btn btn-default">findAll</button>
    <button @click="findByCustomerId" class="btn btn-default">findByCustomerId</button>
    <button @click="save" class="btn btn-default">save</button>
    <button @click="login" class="btn btn-default">login</button>
    <button @click="loginpost" class="btn btn-default">loginpost</button>
  </form>
  <Footer></Footer>
</div>
</template>

<script>
import Nav from '@/components/common/Nav.vue'
import Footer from'@/components/common/Footer.vue'
import axios from 'axios'

export default {
  data(){
    return {
      context: 'http://localhost:9000/customers',
      loginId: '',
      pwd: '',
      id: '32',
      customerId: 'han',
      customerName: '한제규',
      password: '1234',
      ssn: '123456',
      phone: '010-1234-1234',
      city: 'seoul',
      address: 'seoul',
      postalcode: '10-100',
      photo: ''
    }
  },
  components: {
    Nav,
    Footer
  },
  methods: {
    count(){
      axios.get(`${this.context}/count`)
      .then(res=>{
        alert(`GET SUCCESS : ${res.data}`)
      }).catch(e=>{
        alert('ERROR')
      })
    },
    deleteById(){
      axios.delete(`${this.context}/haha`)
      .then(res=>{
        alert(`GET SUCCESS : ${res.data}`)
      }).catch(e=>{
        alert('ERROR')
      })
    },
    existsById(){
      axios.get(`${this.context}/exists/haha`)
      .then(res=>{
        alert(`GET SUCCESS : ${res.data}`)
      }).catch(e=>{
        alert('ERROR')
      })
    },
    findAll(){
      axios.get(`${this.context}`)
      .then(res=>{
        alert(`GET SUCCESS : ${res.data[0].customerName}`)
      }).catch(e=>{
        alert('ERROR')
      })
    },
    findByCustomerId(){
      axios.get(`${this.context}/haha`)
      .then(res=>{
        alert(`GET SUCCESS : ${res.data.customerId}`)
      }).catch(e=>{
        alert('ERROR')
      })
    },
    save(){
      let data = {
        customerId: this.customerId,
        customerName: this.customerName,
        password: this.password,
        ssn: this.ssn,
        phone: this.phone,
        city: this.city,
        address: this.address,
        postalcode: this.postalcode,
        photo: this.photo
      }
      let headers = {
        'Content-Type': 'application/json',
        'Authorization': 'JWT fefege..'
      }
      axios.post(`${this.context}`, JSON.stringify(data), {headers: headers})
      .then(res=>{
        alert(`GET SUCCESS : ${res.data.result}`)
      }).catch(e=>{
        alert('ERROR')
      })
    },
    login(){
      axios.get(`${this.context}/login/haha/1234`)
      .then(res=>{
        alert(`GET SUCCESS : ${res.data.customerId}`)
      }).catch(e=>{
        alert('ERROR')
      })
    },
    loginpost(){
      let data = {
        customerId: this.loginId,
        password: this.pwd
      }
      let headers = {
        'Content-Type': 'application/json',
        'Authorization': 'JWT fefege..'
      }
      alert(`ID : ${this.loginId}  pass : ${this.pwd}`)
      axios.post(`${this.context}/login`, JSON.stringify(data), {headers: headers})
      .then(res=>{
        alert(`GET SUCCESS \nID : ${res.data.customerId}\nNAME : ${res.data.customerName}`)
      }).catch(e=>{
        alert('ERROR')
      })
    }
  }
}
</script>

<style scoped>
</style>