<!-- footer -->
<style lang='scss' scoped>
  .nav-bar {
    position: fixed;
    width: 10rem;
    margin: 0 auto;
    bottom: -1px;
    left: 0;
    right: 0;
    height: 1.35rem;
    padding: .066667rem 0 0;
    background: #fff;
    overflow: hidden;
    clear: both;
    box-shadow: 0px 0px 20px -8px #999;
    display: flex;
    flex: 1;
    z-index: 5000;
    justify-content: flex-start;
    align-items: center;
    flex-direction: row;
    flex-wrap: nowrap;
    border-top: 1px solid #eee;
    .barIcon {
      width: 2.5rem;
      height: 100%;
      cursor: pointer;
      background: url('~jd/images/navbar.png') 0 0 no-repeat;
      background-size: 850% 105%;
    }
    .home {
      background-position: .1rem -0.075rem;
      &.active {
        background-position: -1.585rem -0.02rem;
      }
    }
    .find {
      background-position: -6.654rem -0.075rem;
      &.active {
        background-position: -8.37rem -0.075rem;
      }
    }
    .cart {
      background-position: -10rem -0.075rem;
      &.active {
        background-position: -11.7rem -0.075rem;
      }
    }
    .myHome {
      background-position: -13.45rem -0.075rem;
      &.active {
        background-position: -15.15rem -0.075rem;
      }
    }
  }

</style>
<template>
  <ul class="nav-bar fool">
    <li :class="['barIcon','home',$route.name==='communityIndex'?'active':'']" @click="$router.push('/community/index')"></li>
    <li :class="['barIcon','find',$route.name==='knowledgeIndex'?'active':'']" @click="$router.push('/knowledge/index')"></li>
    <li :class="['barIcon','cart',$route.name==='shopCart'?'active':'']" @click="$router.push('/shop/cart')"></li>
    <li :class="['barIcon','myHome',$route.name==='memberMyhome'?'active':'']" @click="$router.push('/member/myhome')"></li>
  </ul>
</template>

<script>
  export default {
    data() {
      return {

      };
    },

    watch: {},

    components: {},

    computed: {},

    methods: {},

    mounted: function () {}
  }

</script>
