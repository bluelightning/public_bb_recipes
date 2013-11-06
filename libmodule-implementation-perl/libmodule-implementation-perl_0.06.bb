SUMMARY = "Module::Implementation - Loads one of several alternate underlying implementations for a module"
AUTHOR = "Dave Rolsky <autarch@urth.org>"
HOMEPAGE = "https://metacpan.org/module/Module::Implementation"
SECTION = "libs"
LICENSE = "Artistic-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4f33fe2893b9c422c5c7b0158bc87142"

SRC_URI = "http://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Module-Implementation-0.06.tar.gz"
SRC_URI[md5sum] = "748f3540162fc52222d761fab3efb266"
SRC_URI[sha256sum] = "da3b78025ab82b04c042e7cc1fdefc3af225ca90865c215d4d8bcf3bbf54186d"

S = "${WORKDIR}/Module-Implementation-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
