import 'babel-polyfill'
import Vue from 'vue'
import Router from 'vue-router'

/* community */
const CommunityIndex = () => import('page/community/index');

/* knowledge */
const KnowledgeIndex = () => import ('page/knowledge/index')
const KnowledgeArticle = () =>   import ('page/knowledge/article')
const KnowledgeArticleDetail = () => import ('page/knowledge/articleDetail')

/* member */
const MemberLogin = () => import ('page/member/login')
const MemberMyhome = () =>    import ('page/member/myhome')
const MemberRegister = () =>  import ('page/member/register')
const MemberForget = () =>    import ('page/member/forget')
const MemberSttings = () =>   import ('page/member/sttings')
const MemberAddressList = () =>   import ('page/member/addressList')
const MemberAddress = () =>   import ('page/member/address')

/* shop */
const ShopCart = () =>  import ('page/shop/cart')
const ShopCategory = () =>  import ('page/shop/category')
const ShopOrder = () => import ('page/shop/order')
const ShopOrderList = () => import ('page/shop/orderList')
const ShopProduct = () =>   import ('page/shop/product')
const ShopSearchRusult = () =>  import ('page/shop/searchRusult')
const ShopShop = () =>  import ('page/shop/shop')
const ShopCreateOrder = () =>   import ('page/shop/createOrder')
const ShopReview = () =>    import ('page/shop/review')

const appRouter = {
        // mode: 'history',
        routes: [{
                path: '',
                redirect: '/knowledge/index'
            },
            //community
            {
                path: '/community/index',
                name: 'communityIndex',
                component: CommunityIndex,
                meta: { keepAlive: true }
            },
            //knowledge
            {
                path: '/knowledge/index',
                name: 'knowledgeIndex',
                component: KnowledgeIndex,
                meta: { keepAlive: true }
            },
            {
                path: '/knowledge/article',
                name: 'knowledgeArticle',
                component: KnowledgeArticle,
                meta: { keepAlive: true }
            },
            {
                path: '/knowledge/articleDetail/:Id',
                name: 'knowledgeArticleDetail',
                component: KnowledgeArticleDetail,
                meta: { KeepAlive: false }
            },
            //member
            {
                path: '/member/login',
                name: 'memberLogin',
                component: MemberLogin,
                meta: { keepAlive: false }
            },
            {
                path: '/member/myhome',
                name: 'memberMyhome',
                component: MemberMyhome,
                meta: { keepAlive: false }
            },
            {
                path: '/member/register',
                name: 'memberRegister',
                component: MemberRegister,
                meta: { keepAlive: false }
            },
            {
                path: '/member/forget',
                name: 'memberForget',
                component: MemberForget,
                meta: { keepAlive: false }
            },
            {
                path: '/member/sttings',
                name: 'memberSttings',
                component: MemberSttings,
                meta: { keepAlive: false }
            },
            {
                path: '/member/addressList',
                name: 'memberAddresslist',
                component: MemberAddressList,
                meta: { keepAlive: true }
            },
            {
                path: '/member/address/:Id?',
                name: 'memberAddress',
                component: MemberAddress,
                meta: { keepAlive: false }
            },
            //shop
            {
                path: '/shop/cart',
                name: 'shopCart',
                component: ShopCart,
                meta: { keepAlive: false }
            },
            {
                path: '/shop/category',
                name: 'shopCategory',
                component: ShopCategory,
                meta: { keepAlive: true }
            },
            {
                path: '/shop/review/:OrderNo',
                name: 'shopReview',
                component: ShopReview,
                meta: { keepAlive: false }
            },
            {
                path: '/shop/order',
                name: 'shopOrder',
                component: ShopOrder,
                meta: { keepAlive: false }
            },
            {
                path: '/shop/createOrder',
                name: '/shopCreateOrder',
                component: ShopCreateOrder,
                meta: { keepAlive: false }
            },
            {
                path: '/shop/orderList/:tab?',
                name: 'shopOrderList',
                component: ShopOrderList,
                meta: { keepAlive: false }
            },
            {
                path: '/shop/product/:id',
                name: 'shopProduct',
                component: ShopProduct,
                meta: { keepAlive: false }
            },
            {
                path: '/shop/searchRusult',
                name: 'shopSearchRusult',
                component: ShopSearchRusult,
                meta: { keepAlive: false }
            },
            {
                path: '/shop/shop',
                name: 'shopShop',
                component: ShopShop,
                meta: { keepAlive: false }
            },
        ]
    }
    // import example from '@/router/example'
    // example.map(i=>{appRouter.routes.push(i)}) // 部署线上记得吧这行代码注释掉

Vue.use(Router)


export default new Router(appRouter);