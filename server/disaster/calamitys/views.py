from calamitys.models import calamity
from calamitys.serializers import calamitySerializer
from rest_framework import generics


class calamityList(generics.ListCreateAPIView):
    queryset = calamity.objects.all()
    serializer_class = calamitySerializer


class calamityDetail(generics.RetrieveUpdateDestroyAPIView):
    queryset = calamity.objects.all()
    serializer_class = calamitySerializer


from math import sin, cos, sqrt, atan2

R = 6373.0

lat1 = department.objects.filter(lat)
lon1 = department.objects.filter(lat)
lat2 = 52.406374
lon2 = 16.9251681

dlon = lon2 - lon1
dlat = lat2 - lat1
a = (sin(dlat/2))**2 + cos(lat1) * cos(lat2) * (sin(dlon/2))**2
c = 2 * atan2(sqrt(a), sqrt(1-a))
distance = R * c

print "Result", distance
print "Should be", 278.546

