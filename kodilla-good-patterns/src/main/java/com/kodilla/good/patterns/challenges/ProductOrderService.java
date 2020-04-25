package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private  OrderService orderService;
    private  OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderRepository orderRepository){
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getOrderInfo());

        if(isOrdered){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getOrderInfo());
            return new OrderDto(orderRequest.getUser(),true);
        }else{
            return new OrderDto(orderRequest.getUser(),false);
        }
    }
}
