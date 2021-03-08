from django.shortcuts import render

# Create your views here.
from .models import Action
from django.urls import reverse
from django.http import HttpResponseRedirect
from django.http import HttpResponse

def index(request):
    actions = Action.objects.all()
    context = {
        'actions': actions,
    }
    return render(request, 'myApp/index.html',context)

def show_completed(request):
    actions = Action.objects.filter(status="C")
    context= {
        'completed_actions' : actions,
    }
    return render(request, 'myApp/completed.html',context);

def show_action(request, action_id):
    action = Action.objects.get(id=action_id)
    context = {
        'action' : action,
    }
    return render(request, 'myApp/action.html',context)

def update_status(request):
    new_status = request.POST['status']
    action_id = request.POST['action_id']
    action = Action.objects.get(id=action_id)
    action.status = new_status
    action.save()
    return HttpResponseRedirect(reverse('action', args=(action_id)))
def new_action(request):
    if request.method == "POST":
        try:
            name = request.POST['name']
            status = request.POST['status']
            action = Action(name =name, status= status)
            action.save()
            return HttpResponseRedirect(reverse('index'))
        except Exception as e:
            return HttpResponse(status=500)

    elif request.method =="GET":
        return render(request,"myApp/new_action.html")